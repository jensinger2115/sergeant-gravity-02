package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;

public class TestsetEvaluation extends Evaluation {

    /** Attributes */
    /**
     * 
     */
    private Model model;

    /**
     * Operation getObjectType
     *
     * @return String
     */
    public String getObjectType() {
        return null;
    }

    /**
     * Operation evaluate
     *
     */
    public void evaluate() {
    }

    /**
     * Operation getModel
     *
     * @return Model
     */
    public Model getModel() {
        return null;
    }

    /**
     * Operation setModel
     *
     * @param model
     *            -
     */
    public void setModel(Model model) {
    }

    public TestsetEvaluation(URI evaluationUri, Permission perm) {
        super(evaluationUri, perm);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected SEITANObjectAccessor getAccessor(URI databaseId, Permission perm) {
        // TODO Auto-generated method stub
        return null;
    }
}
