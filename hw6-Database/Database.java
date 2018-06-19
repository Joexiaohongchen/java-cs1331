import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * A database of past Messages that have been sent.
 *
 * @author CS1331 TAs
 * @version 14.4.2
 */
public class Database {
    private List<Message> messages;
    private Message speMessage;
/**
* Constructor
* @param messages creating a list that take the Message type
*/
    public Database(List<Message> messages) {
        this.messages = messages;
    }
/**
 * getMessage method
 * @param n the nth message where 0 <= n < size of list
 * @return Returns the nth message where 0 <= n < size of list
 */
    public Message getMessage(int n) {
        if (n >= 0 && n <= messages.size()) {
            speMessage = messages.get(n);
        }
        return speMessage;
    }
/**
 * getMessages method
 * @return Returns all the messages stored in the database
 */
    public List<Message> getMessages() {
        return messages;
    }
/**
 * filter method
 * @param filter creating a filter object from the preficate that take
 * Message type
 * @return Returns the list of messages filtered by the predicate
 */
    public List<Message> filter(Predicate<Message> filter) {
        List<Message> newFiltered = new ArrayList<>();
        for (Message message : messages) {
            if (filter.test(message)) {
                newFiltered.add(message);
            }
        }
        return newFiltered;
    }
/**
 * getMessagesBetween method
 * @param start the message were sent after the start time
 * @param end the message were sent before the end time
 * @return RReturns a list of messages if the time that the message is
 * sent is between the start
 */
    public List<Message> getMessagesBetween(LocalDateTime start,
                                        LocalDateTime end) {
        return filter((Message p) -> (p.getDate().isAfter(start)
            || p.getDate().isEqual(start)) && (p.getDate().isBefore(end)
            || p.getDate().isEqual(end)));
    }
/**
 * sortMessagesByContact method
 * @return Returns a Map that stores a contact name as a key and a list
 * of messages from that contact as a value
 */
    public Map<String, List<Message>> sortMessagesByContact() {
        Map<String, List<Message>> contactSort = new HashMap<>();
        List<Message> l1 = filter(new Predicate<Message>() {
            public boolean test(Message m) {
                return m.getContactName().isPresent();
            }
        });

        for (Message message : l1) {
            String contactNameString = message.getContactName().get();
            if (!contactSort.containsKey(contactNameString)) {
                contactSort.put(contactNameString, new ArrayList<Message>());
            }
            contactSort.get(contactNameString).add(message);
        }
        return contactSort;
    }
/**
 * getMessagesWithKeyword method
 * @param keyword there are keyword corresponding to Message
 * @return Returns a list of messages if the body of the message
 * contains the keyword
 */
    public List<Message> getMessagesWithKeyword(String keyword) {
        class KeywordPredicate implements Predicate<Message> {
            public boolean test(Message m) {
                return m.getBody().contains(keyword);
            }
        }
        return filter(new KeywordPredicate());
    }
/**
 * getMessagesWithPriority method
 * @return Returns a list of messages if the message is marked as
 * important
 */
    public List<Message> getMessagesWithPriority() {
        return filter(Message::getIsImportant);
    }
}