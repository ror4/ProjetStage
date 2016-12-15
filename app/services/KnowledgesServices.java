package services;

import models.Collaborator;
import models.Knowledge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Formation on 13/12/2016.
 */
public class KnowledgesServices implements IKnowledgesServices {

    @Override
    public void addKnowledge(String name) {
        Knowledge know = new Knowledge();
        know.name=name;
        know.save();
    }

    @Override
    public void deleteKnowledge(Long id) {

    }

    @Override
    public Knowledge getKnowledgeByName(String name) {
        List<Knowledge> know = Knowledge.find("name=?",name).fetch();
        return know.get(0);
    }

    @Override
    public List<Knowledge> getAllKnowledgeJson() {
        List<Knowledge> know = Knowledge.findAll();
        return know;
    }

    @Override
    public void modifyKnowledge(Knowledge knowledge, String level) {

    }
}
