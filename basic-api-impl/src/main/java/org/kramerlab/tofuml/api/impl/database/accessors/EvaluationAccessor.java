package org.kramerlab.tofuml.api.impl.database.accessors;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.ReviewableSEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;
import org.kramerlab.tofuml.api.impl.logic.objects.Model;

public class EvaluationAccessor extends ReviewableSEITANObjectAccessor {
    public EvaluationAccessor(URI databaseId, Permission perm) {
        super(databaseId, perm);
        // TODO Auto-generated constructor stub
    }

    /**
     * Operation getMetrics
     *
     * @return Map<String,Object>
     */
    public Map<String, Object> getMetrics() {
        return new HashMap<String, Object>();
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
     * Operation getClassifier
     *
     * @return Algorithm
     */
    public Algorithm getClassifier() {
        return null;
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
     * Operation getNumFolds
     *
     * @return int
     */
    public int getNumFolds() {
        return -1;
    }

    /**
     * Operation getSeed
     *
     * @return long
     */
    public long getSeed() {
        return -1;
    }

    /**
     * Operation getClassifierOptions
     *
     * @return String[]
     */
    public String[] getClassifierOptions() {
        return null;
    }

    /**
     * Operation getDatasetOptions
     *
     * @return String[]
     */
    public String[] getDatasetOptions() {
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
