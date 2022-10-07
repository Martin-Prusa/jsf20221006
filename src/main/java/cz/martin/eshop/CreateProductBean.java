package cz.martin.eshop;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;

@Named
@RequestScoped
public class CreateProductBean {
    @Inject
    private EshopService service;
    @Inject
    private MessagesService messagesService;

    private Product newProduct = new Product("", "");

    public void save() throws IOException {
        this.service.add(newProduct);
        this.newProduct = new Product("", "");
        FacesContext.getCurrentInstance()
                .getExternalContext().redirect("eshop.xhtml");
        messagesService.addMessage("Created", true);
    }

    public Product getNewProduct() {
        return newProduct;
    }
}
