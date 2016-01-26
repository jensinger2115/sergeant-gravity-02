package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;
import java.util.Map;

import org.apache.jena.atlas.json.JsonObject;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.objects.ReviewableSEITANObject;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.database.accessors.EvaluationAccessor;

public abstract class Evaluation extends ReviewableSEITANObject
{
    /** Attributes */
    /**
     * 
     */
    private Dataset testedOn;
    /**
     * 
     */
    private String datasetOptions;
    /**
     * 
     */
    private Map<String,String> metrics;
    /** Associations */
    private EvaluationAccessor accessor;
    /**
     * Operation Evaluation
     *
     * @param evaluationUri - 
     * @param perm - 
     * @return 
     */
    public Evaluation ( URI evaluationUri, Permission perm ){
        super(evaluationUri, perm);
    }

    /**
     * Operation get
     *
     * @param metric - 
     * @return String
     */
    public String get ( String metric ){
        return null;
    }

    /**
     * Operation toJson
     *
     * @return String
     */
    public JsonObject toJson (  ){
        return null;
    }

    /**
     * Operation getDataset
     *
     * @return Dataset
     */
    public Dataset getDataset (  ){
        return null;
    }

    /**
     * Operation getDatasetOptions
     *
     * @return String[]
     */
    public String[] getDatasetOptions (  ){
        return null;
    }

    /**
     * Operation evaluate
     *
     */
    abstract public void evaluate (  );

    /**
     * Operation setDataset
     *
     * @param data - 
     */
    public void setDataset ( Dataset data ){
        return;
    }

    /**
     * Operation setDatasetOptions
     *
     * @param options - 
     */
    public void setDatasetOptions ( String[] options ){
        return;
    }


}

