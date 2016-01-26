package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;

import org.apache.jena.atlas.json.JsonObject;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.objects.ReviewableSEITANObject;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.database.accessors.AlgorithmAccessor;

public abstract class Algorithm extends ReviewableSEITANObject implements
        TOFUMLClassifier {
    /** Attributes */
    /**
     * 
     */
    private TOFUMLClassifier classifier;
    /** Associations */
    private AlgorithmAccessor accessor;

    /**
     * Operation Algorithm
     *
     * @param databaseId
     *            -
     * @param perm
     *            -
     * @return
     */
    public Algorithm(URI databaseId, Permission perm) {
        super(databaseId, perm);
    }

    /**
     * Operation getClassifier
     *
     * @return TOFUMLClassifier
     */
    abstract public TOFUMLClassifier getClassifier();

    /**
     * Operation getOptions
     *
     * @return String
     */
    public abstract String getOptions();

    /**
     * Operation isInternal
     *
     * @return boolean
     */
    public abstract boolean isInternal();

    /**
     * Operation toJson
     *
     * @return String
     * @throws SEITANException
     */
    public JsonObject toJson() throws SEITANException {
        return super.toJson();
    }

    /**
     * Operation setOptions
     *
     * @param options
     *            -
     */
    public void setOptions(String[] options) {
    }

}
