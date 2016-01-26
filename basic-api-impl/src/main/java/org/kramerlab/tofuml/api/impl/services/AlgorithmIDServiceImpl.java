package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;

import javax.ws.rs.core.UriInfo;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.AlgorithmIDService;
import org.kramerlab.tofuml.api.impl.mediation.AlgorithmInterface;

public class AlgorithmIDServiceImpl extends
        SeitanServiceImpl<AlgorithmInterface> implements AlgorithmIDService {
    /**
     * Operation getAlgorithmJSON
     *
     * @param uri
     *            -
     * @return String
     */
    public String getAlgorithmJSON(UriInfo uri) {
        return null;
    }

    /**
     * Operation deleteAlgorithm
     *
     * @param uri
     *            -
     */
    public void deleteAlgorithm(UriInfo uri) {
    }

    /**
     * Operation updateAlgorithm
     *
     * @param uri
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateAlgorithm(UriInfo uri, String newName, String newDesc) {
    }

    @Override
    protected AlgorithmInterface intitializeMediation(String username,
            URI request) throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }




}
