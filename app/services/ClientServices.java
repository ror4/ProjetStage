package services;

import models.Client;

public class ClientServices implements IClientServices{

    @Override
    public void createClient(String corporateName, String postalCode, String telephoneNumber){
        Client client = new Client();
        client.corporateName = corporateName;
        client.postalCode = postalCode;
        client.telephoneNumber = telephoneNumber;
        client.save();
    }
}
