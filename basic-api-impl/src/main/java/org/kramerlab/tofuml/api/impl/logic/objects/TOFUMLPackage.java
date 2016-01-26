package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.apache.jena.atlas.json.JsonObject;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.objects.Package;

public class TOFUMLPackage extends Package {

    /** Attributes */
    /**
     * 
     */
    private Set<Dataset> datasets;
    /**
     * 
     */
    private Set<Model> models;
    /**
     * 
     */
    private Set<Evaluation> evaluations;

    public TOFUMLPackage(URI dbId, Permission access) {
        super(dbId, access);
        System.out.println(this.getClass().getName() + " invoked");
    }

    /**
     * Operation getDatasets
     *
     * @return Set<Dataset>
     */
    public Set<Dataset> getDatasets() {
        return new HashSet<Dataset>();
    }

    /**
     * Operation getDataset
     *
     * @param datasetId
     *            -
     * @return Dataset
     */
    public Dataset getDataset(URI datasetId) {
        return null;
    }

    /**
     * Operation toJson
     *
     * @return String
     */
    public JsonObject toJson() throws SEITANException {
        return super.toJson();
    }

    /**
     * Operation getModels
     *
     * @return Set<Model>
     */
    public Set<Model> getModels() {
        return new HashSet<Model>();
    }

    /**
     * Operation getModel
     *
     * @param modelUri
     *            -
     * @return Model
     */
    public Model getModel(URI modelUri) {
        return null;
    }
    
    public Set<Evaluation> getEvaluations(){
        return new HashSet<Evaluation>();
    }
    
    public Evaluation getEvaluation(URI evaluationUri){
        return null;
    }

}
