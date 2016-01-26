package org.kramerlab.tofuml.api.impl.database.accessors;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.ReviewableSEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;
import org.kramerlab.tofuml.api.impl.logic.objects.Evaluation;

import weka.classifiers.Classifier;

public class ModelAccessor extends ReviewableSEITANObjectAccessor {

    public ModelAccessor(URI databaseId, Permission perm) {
        super(databaseId, perm);
        // TODO Auto-generated constructor stub
    }

    /**
     * Operation getClassifier
     *
     * @return Classifier
     */
    public Classifier getClassifier() {
        return null;
    }

    /**
     * Operation getDataset
     *
     * @return Dataset
     */
    public Dataset getDataset() {
        return null;
    }

    /**
     * Operation getUsedParameters
     *
     * @return String[]
     */
    public String[] getUsedParameters() {
        return null;
    }

    /**
     * Operation getEvaluations
     *
     * @return Set<Evaluation>
     */
    public Set<Evaluation> getEvaluations() {
        return new HashSet<Evaluation>();
    }

    /**
     * Operation getEvaluation
     *
     * @param databaseId
     *            -
     * @return Evaluation
     */
    public Evaluation getEvaluation(URI databaseId) {
        return null;
    }

    /**
     * /** Operation getStatus
     *
     * @return String
     */
    public String getStatus() {
        return null;
    }

    @Override
    protected SEITANObject concreteSave(SEITANObject obj)
            throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void concreteUpdate(SEITANObject obj) throws SEITANException {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void concreteDelete(SEITANObject obj) throws SEITANException {
        // TODO Auto-generated method stub
        
    }
}
