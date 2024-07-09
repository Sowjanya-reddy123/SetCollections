
import java.util.*;
public class EmailListCleaner {
    private List<String>emailList;
    private Set<String>uniqueEmails;
    public EmailListCleaner(){
        emailList=new ArrayList<>();
        uniqueEmails=new HashSet<>();
    }
    void addEmails(List<String> emails){
        emailList.addAll(emails);
    }
    public void removeDuplicates(){
        uniqueEmails.addAll(emailList);
    }
    public void displayUniqueEmails(){
        for (String email:uniqueEmails){
            System.out.println(email);
        }
    }

    public static void main(String[] args) {
        EmailListCleaner cleaner =new EmailListCleaner();
        List<String> emails = new ArrayList<>();
        emails.add("sowjanya@gmail.com");
        emails.add("chinnu@gmail.com");
        emails.add("junnu@gmail.com");
        emails.add("chotu@gmail.com");
        emails.add("pooja@gmail.com");

        // Add emails to the list
        cleaner.addEmails(emails);
        // Remove duplicates
        cleaner.removeDuplicates();
        // Display unique email addresses
        System.out.println("Unique email addresses:");
        cleaner.displayUniqueEmails();
    }
}