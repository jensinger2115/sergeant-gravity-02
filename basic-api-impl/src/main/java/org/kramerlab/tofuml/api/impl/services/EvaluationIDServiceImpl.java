package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;

import javax.ws.rs.core.UriInfo;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.EvaluationIDService;
import org.kramerlab.tofuml.api.impl.mediation.EvaluationInterface;

public class EvaluationIDServiceImpl extends
        SeitanServiceImpl<EvaluationInterface> implements EvaluationIDService {
    /**
     * Operation getEvaluationJSON
     *
     * @param uri
     *            -
     * @return String
     */
    public String getEvaluationJSON(UriInfo uri) {
        return null;
    }

    public void deleteEvaluation(UriInfo uri) {
        // TODO Auto-generated method stub

    }

    public void updateEvaluation(UriInfo uri, String newName, String newDesc) {
        // TODO Auto-generated method stub

    }

    @Override
    protected EvaluationInterface intitializeMediation(String username,
            URI request) throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
