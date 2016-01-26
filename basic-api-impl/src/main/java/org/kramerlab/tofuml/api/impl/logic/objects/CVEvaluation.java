package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;

public class CVEvaluation extends Evaluation {
    public CVEvaluation(URI evaluationUri, Permission perm) {
        super(evaluationUri, perm);
        // TODO Auto-generated constructor stub
    }

    /** Attributes */
    /**
     * 
     */
    private TOFUMLClassifier classifier;
    /**
     * 
     */
    private String[] classifierOptions;
    /**
     * 
     */
    private int numFolds;
    /**
     * 
     */
    private long seed;

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
     * Operation getClassifier
     *
     * @return Algorithm
     */
    public Algorithm getClassifier() {
        return null;
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
     * Operation setClassifier
     *
     * @param classifier
     *            -
     */
    public void setClassifier(Algorithm classifier) {
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
     * Operation setSeed
     *
     * @param seed
     *            -
     */
    public void setSeed(long seed) {
    }

    /**
     * Operation setNumFolds
     *
     * @param folds
     *            -
     */
    public void setNumFolds(int folds) {
    }

    /**
     * Operation getNumFolds
     *
     * @return int
     */
    public int getNumFolds() {
        return -1;
    }

    @Override
    protected SEITANObjectAccessor getAccessor(URI databaseId, Permission perm) {
        // TODO Auto-generated method stub
        return null;
    }
}
