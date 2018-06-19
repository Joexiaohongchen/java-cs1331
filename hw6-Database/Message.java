import java.util.Optional;
import java.time.LocalDateTime;
/**
 * A representaton of a text message.
 *
 * @author CS1331 TAs
 * @version 14.4.2
 */
public class Message {
    private Optional<String> contactName;
    private String to;
    private String from;
    private String body;
    private LocalDateTime date;
    private boolean isImportant;
/**
* Constructor
* @param contactName there is no null value at contact name list
* @param to the people who got the message
* @param from the people who sent the message
* @param body the context of the message
* @param date the date of message sent
* @param isImportant determine the message is important or not
*/
    public Message(Optional<String> contactName,
                String to, String from, String body,
                LocalDateTime date, boolean isImportant) {
        this.contactName = contactName;
        this.to = to;
        this.from = from;
        this.body = body;
        this.date = date;
        this.isImportant = isImportant;
    }
/**
 * getContactName method
 *
 * @return return the contact name which has not null
 */
    public Optional<String> getContactName() {
        return contactName;
    }

/**
 * getTo method
 *
 * @return return the people who got the message
 */
    public String getTo() {
        return to;
    }
/**
 * getFrom method
 *
 * @return return the people who sent the message
 */
    public String getFrom() {
        return from;
    }
/**
 * getBody method
 *
 * @return return the context of the message
 */
    public String getBody() {
        return body;
    }
/**
 * getDate method
 *
 * @return return the date of the message was sent
 */
    public LocalDateTime getDate() {
        return date;
    }
/**
 * getIsImportant method
 *
 * @return return the message is important or not
 */
    public boolean getIsImportant() {
        return isImportant;
    }

}