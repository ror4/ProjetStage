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
    public void addKnowledge(Integer levelKnowledge, Collaborator collabo) {
//        Set<Knowledge> listKnowledge = new HashSet();
        Knowledge know = new Knowledge();
        know.name = "anglais";
        know.level = levelKnowledge;
        know.collaborator=collabo;
        know.save();
    }

    @Override
    public void deleteKnowledge(Long id) {

    }

    @Override
    public List<Knowledge> getKnowledges() {
        return null;
    }

    @Override
    public void modifyKnowledge(Knowledge knowledge, String level) {

    }
}
