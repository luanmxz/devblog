package dev.luanmarcene.DevBlog.views;

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

        input.addSubmitListener(event -> {
            messages.setItems(new MessageListItem(event.getValue()));
        });

    }
}
