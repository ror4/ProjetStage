package services;

import models.Knowledge;

import java.util.List;

/**
 * Created by Formation on 12/12/2016.
 */
public interface IKnowledgesServices {

    public void addKnowledge(String name);

    public void deleteKnowledge(Long id);

    public Knowledge getKnowledgeByName(String name);

    public void modifyKnowledge(Knowledge knowledge,String level);
}
