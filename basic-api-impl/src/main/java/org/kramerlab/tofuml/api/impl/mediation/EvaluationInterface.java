package org.kramerlab.tofuml.api.impl.mediation;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.mediation.SEITANInterface;
import org.kramerlab.tofuml.api.impl.logic.objects.Evaluation;

public class EvaluationInterface extends SEITANInterface {
    public EvaluationInterface(String username, URI request)
            throws SEITANException {
        super(username, request);
        // TODO Auto-generated constructor stub
    }

    /**
     * Operation getEvaluation
     *
     * @param databaseId
     *            -
     * @return Evaluation
     */
    public Evaluation getEvaluation(URI databaseId) {
        return null;
    }

    /**
     * Operation getEvaluations
     *
     * @return Set<Evaluation>
     */
    public Set<Evaluation> getEvaluations() {
        return new HashSet<Evaluation>();
    }

    /**
     * Operation deleteEvaluation
     *
     * @param databaseId
     *            -
     */
    public void deleteEvaluation(URI databaseId) {
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
     * @param datasetUri
     *            -
     * @param datasetOptions
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
     * @return Evaluation
     */
    public Evaluation addEvaluation(String type, URI datasetUri,
            String[] datasetOptions, URI modelUri, URI algorithmUri,
            String[] classifierOptions, String name, String desc) {
        return null;
    }

    /**
     * Operation updateEvaluation
     *
     * @param databaseId
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateEvaluation(URI databaseId, String newName, String newDesc) {
    }
}
