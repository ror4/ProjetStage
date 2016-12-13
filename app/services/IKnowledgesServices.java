package services;

import models.Collaborator;
import models.Knowledge;

import java.util.List;

/**
 * Created by Formation on 12/12/2016.
 */
public interface IKnowledgesServices {

    public void addKnowledge(Integer ang, Collaborator collabo);

    public void deleteKnowledge(Long id);

    public List<Knowledge> getKnowledges();

    public void modifyKnowledge(Knowledge knowledge,String level);
}
