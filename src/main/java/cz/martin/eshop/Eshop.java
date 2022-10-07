package cz.martin.eshop;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named("shop")
@RequestScoped
public class Eshop {
    @Inject
    private EshopService service;

    @Inject
    private MessagesService messagesService;

    private String filter = "";

    public void deleteProduct(Product p) {
        service.getProducts().remove(p);
        messagesService.addMessage("Removed", false);
    }

    public void deleteMessage(Message text) {
        this.messagesService.deleteMessage(text);
    }

    public List<Message> getMessages() {
        return messagesService.getMessages();
    }

    public List<Product> getProducts() {
        return service.getProducts().stream().filter(i -> i.getName().contains(this.filter)).toList();
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
