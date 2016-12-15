package controllers;

import models.Client;
import play.mvc.Controller;

import java.util.List;

public class ClientController extends Controller{
    public static void clients(){
        List<Client> listClients = Client.findAll();
        render(listClients);
    }

    public static void create(){
        render();
    }

    public static void save(Client client){
        client.save();
        clients();
    }
}
