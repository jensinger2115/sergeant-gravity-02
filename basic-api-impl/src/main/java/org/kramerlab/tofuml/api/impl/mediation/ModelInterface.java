package org.kramerlab.tofuml.api.impl.mediation;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.mediation.SEITANInterface;
import org.kramerlab.tofuml.api.impl.logic.objects.Model;

public class ModelInterface extends SEITANInterface {
    public ModelInterface(String username, URI request) throws SEITANException {
        super(username, request);
        // TODO Auto-generated constructor stub
    }

    /**
     * Operation getModel
     *
     * @param databaseId
     *            -
     * @return Model
     */
    public Model getModel(URI databaseId) {
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
     * Operation deleteModel
     *
     * @param databaseId
     *            -
     */
    public void deleteModel(URI databaseId) {
    }

    /**
     * Operation deleteModels
     *
     */
    public void deleteModels() {
    }

    /**
     * Operation addModel
     *
     * @param algorithmUri
     *            -
     * @param classifierOptions
     *            -
     * @param datasetUri
     *            -
     * @param datasetOptions
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     * @return Model
     */
    public Model addModel(URI algorithmUri, String[] classifierOptions,
            URI datasetUri, String[] datasetOptions, String name, String desc) {
        return null;
    }

    /**
     * Operation updateModel
     *
     * @param databaseId
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateModel(URI databaseId, String newName, String newDesc) {
    }
}
