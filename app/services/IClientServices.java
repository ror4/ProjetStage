package services;

import models.Client;

import java.util.List;

/**
 * Created by Administrateur on 15/12/2016.
 */
public interface IClientServices {
    public void createClient(String corporateName, String postalCode, String telephoneNumber);

    public void deleteClient(Long id);

    public Client modifClient(Client client);

    public List<Client> getAllClient();

    public Client getClientById(Long id);
}
