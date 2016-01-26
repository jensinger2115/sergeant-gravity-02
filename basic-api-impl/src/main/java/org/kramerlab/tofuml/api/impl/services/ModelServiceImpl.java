package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.ModelService;
import org.kramerlab.tofuml.api.impl.logic.objects.Model;
import org.kramerlab.tofuml.api.impl.mediation.ModelInterface;

public class ModelServiceImpl extends SeitanServiceImpl<ModelInterface>
        implements ModelService {
    /**
     * Operation getModelsJSON
     *
     * @return String
     */
    public String getModelsJSON() {
        return null;
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
     * @param classifier
     *            -
     * @param classifierOptions
     *            -
     * @param dataset
     *            -
     * @param datasetOptions
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     */
    public void addModel(String classifier, String classifierOptions,
            String dataset, String datasetOptions, String name, String desc) {
    }

    /**
     * Operation getModels
     *
     * @return Set<Model>
     */
    protected Set<Model> getModels() {
        return new HashSet<Model>();
    }

    @Override
    protected ModelInterface intitializeMediation(String username, URI request)
            throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
