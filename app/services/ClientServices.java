package services;

import models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientServices implements IClientServices{

    @Override
    public void createClient(String corporateName, String postalCode, String telephoneNumber){
        Client client = new Client();
        client.corporateName = corporateName;
        client.postalCode = postalCode;
        client.telephoneNumber = telephoneNumber;
        client.save();
    }

    @Override
    public void deleteClient(Long id) {

    }

    @Override
    public Client modifClient(Client client) {
        return null;
    }

    @Override
    public List<Client> getAllClient() {
        List<Client> clientList= new ArrayList();
        clientList=Client.findAll();
        return clientList;
    }

    @Override
    public Client getClientById(Long id) {
        return null;
    }

}
