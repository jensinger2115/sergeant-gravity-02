package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.EvaluationService;
import org.kramerlab.tofuml.api.impl.logic.objects.Evaluation;
import org.kramerlab.tofuml.api.impl.mediation.EvaluationInterface;

public class EvaluationServiceImpl extends
        SeitanServiceImpl<EvaluationInterface> implements EvaluationService {
    /**
     * Operation getEvaluationsJSON
     *
     * @return String
     */
    public String getEvaluationsJSON() {
        return null;
    }

    /**
     * Operation deleteEvaluations
     *
     */
    public void deleteEvaluations() {
    }

    /**
     * Operation addEvaluation
     *
     * @param type
     *            -
     * @param dataset
     *            -
     * @param datasetOption
     *            -
     * @param modelUri
     *            -
     * @param algorithmUri
     *            -
     * @param classifierOptions
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     */
    public void addEvaluation(String type, String dataset,
            String datasetOption, String modelUri, String algorithmUri,
            String classifierOptions, String name, String desc) {
    }

    /**
     * Operation getEvaluations
     *
     * @return Set<Evaluation>
     */
    protected Set<Evaluation> getEvaluations() {
        return new HashSet<Evaluation>();
    }

    @Override
    protected EvaluationInterface intitializeMediation(String username,
            URI request) throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
