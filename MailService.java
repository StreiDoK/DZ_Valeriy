package andrV2021;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.List;


public class MailService <T> implements Consumer<Message <T>> {
    private final MyMap<String, List<T>> mailBox = new MyMap<>();


    @Override
    public void accept(Message<T> message){
        String key = message.getTo();
        T content = message.getContent();
        if(mailBox.containsKey(key)) {
            mailBox.get(key).add(content);
        }else {
            List<T> contentList = new ArrayList<>();
            contentList.add(content);
            mailBox.put(key, contentList);
        }
    }
    public  MyMap<String, List<T>> getMailBox(){
        return mailBox;
    }
}

