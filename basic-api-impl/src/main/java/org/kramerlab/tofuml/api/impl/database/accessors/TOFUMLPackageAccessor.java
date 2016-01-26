package org.kramerlab.tofuml.api.impl.database.accessors;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.PackageAccessor;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;
import org.kramerlab.tofuml.api.impl.logic.objects.Evaluation;
import org.kramerlab.tofuml.api.impl.logic.objects.Model;

public class TOFUMLPackageAccessor extends PackageAccessor {

    public TOFUMLPackageAccessor(URI databaseId, Permission perm) {
        super(databaseId, perm);
    }

    public Model getModel(URI modelUri) {
        return null;
    }
    
    public Set<Evaluation> getEvaluations(){
        return new HashSet<Evaluation>();
    }
    
    public Evaluation getEvaluation(URI evaluationUri){
        return null;
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
}
