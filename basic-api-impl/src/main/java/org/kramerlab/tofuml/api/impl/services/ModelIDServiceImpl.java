package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;

import javax.ws.rs.core.UriInfo;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.ModelIDService;
import org.kramerlab.tofuml.api.impl.logic.objects.Model;
import org.kramerlab.tofuml.api.impl.mediation.ModelInterface;

public class ModelIDServiceImpl extends SeitanServiceImpl<ModelInterface>
        implements ModelIDService {
    /**
     * Operation getModelJSON
     *
     * @param uri
     *            -
     * @return String
     */
    public String getModelJSON(UriInfo uri) {
        return null;
    }

    /**
     * Operation deleteModel
     *
     * @param uri
     *            -
     */
    public void deleteModel(UriInfo uri) {
    }

    /**
     * Operation updateModel
     *
     * @param uri
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateModel(UriInfo uri, String newName, String newDesc) {
    }

    /**
     * Operation getModel
     *
     * @param uri
     *            -
     * @return Model
     */
    protected Model getModel(URI uri) {
        return null;
    }

    @Override
    protected ModelInterface intitializeMediation(String username, URI request)
            throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
