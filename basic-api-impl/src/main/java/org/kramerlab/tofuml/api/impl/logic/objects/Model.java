package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;

import org.apache.jena.atlas.json.JsonObject;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.database.accessors.ModelAccessor;

import weka.core.Instances;

public class Model extends SEITANObject {
    /** Attributes */
    /**
     * 
     */
    protected Algorithm classifier;
    /**
     * 
     */
    protected Dataset trainSet;
    /**
     * 
     */
    protected String status;
    /**
     * 
     */
    protected String[] classifierOptions;
    /**
     * 
     */
    protected String description;
    /** Associations */
    private ModelAccessor accessor;

    /**
     * Operation Model
     *
     * @param modelUri
     *            -
     * @param perm
     *            -
     * @return
     */
    public Model(URI modelUri, Permission perm) {
        super(modelUri, perm);
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
     * Operation setClassifier
     *
     * @param classifierName
     *            -
     * @param options
     *            -
     */
    public void setClassifier(String classifierName, String[] options) {
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
     * Operation build
     *
     * @return Model
     */
    public Model build() {
        return null;
    }

    /**
     * Operation toJson
     *
     * @return String
     */
    public JsonObject toJson() {
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
     * Operation setDataset
     *
     * @param ds
     *            -
     */
    public void setDataset(Dataset ds) {
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
     * Operation setParameters
     *
     * @param params
     *            -
     */
    public void setParameters(String[] params) {
    }

    /**
     * Operation getTrainSet
     *
     * @return Instances
     */
    public Instances getTrainSet() {
        return null;
    }

    /**
     * Operation getStatus
     *
     * @return String
     */
    public String getStatus() {
        return null;
    }

    /**
     * Operation toPMML
     *
     * @return String
     */
    public String toPMML() {
        return null;
    }

    /**
     * Operation getDescription
     *
     * @return String
     */
    public String getDescription() {
        return null;
    }

    /**
     * Operation setDescription
     *
     * @param desc
     *            -
     */
    public void setDescription(String desc) {
    }

    @Override
    public String getObjectType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected SEITANObjectAccessor getAccessor(URI databaseId, Permission perm) {
        // TODO Auto-generated method stub
        return null;
    }
}
