package dev.luanmarcene.DevBlog.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        setSizeFull();
        MessageList messages = new MessageList();
        messages.setSizeFull();
        add(messages);

        MessageInput input = new MessageInput();
        input.setWidth("50%");
        input.addClassNames(LumoUtility.AlignSelf.CENTER);

        add(input);

        List<MessageListItem> listMessages = new ArrayList<>();

        input.addSubmitListener(event -> {
            listMessages.add(new MessageListItem(event.getValue()));

            messages.setItems(listMessages.stream().map(message -> message).toList());
        });

    }
}
