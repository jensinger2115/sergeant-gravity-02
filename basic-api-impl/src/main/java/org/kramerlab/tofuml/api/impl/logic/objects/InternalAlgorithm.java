package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;

import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;

public class InternalAlgorithm extends Algorithm {
    public InternalAlgorithm(URI databaseId, Permission perm) {
        super(databaseId, perm);
        // TODO Auto-generated constructor stub
    }

    /** Attributes */
    /**
     * 
     */
    private String classifierClass;

    /**
     * Operation getClassifier
     *
     * @return TOFUMLClassifier
     */
    public TOFUMLClassifier getClassifier() {
        return null;
    }

    /**
     * Operation getObjectType
     *
     * @return String
     */
    public String getObjectType() {
        return null;
    }

    @Override
    public String getOptions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isInternal() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected SEITANObjectAccessor getAccessor(URI databaseId, Permission perm) {
        // TODO Auto-generated method stub
        return null;
    }

    public void buildClassifier(Instances data) throws Exception {
        // TODO Auto-generated method stub
        
    }

    public double classifyInstance(Instance instance) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    public double[] distributionForInstance(Instance instance) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    public Capabilities getCapabilities() {
        // TODO Auto-generated method stub
        return null;
    }
}
