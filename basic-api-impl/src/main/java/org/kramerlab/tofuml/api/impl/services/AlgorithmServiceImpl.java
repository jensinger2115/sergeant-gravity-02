package org.kramerlab.tofuml.api.impl.services;

import java.io.InputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.AlgorithmService;
import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;
import org.kramerlab.tofuml.api.impl.mediation.AlgorithmInterface;

public class AlgorithmServiceImpl extends SeitanServiceImpl<AlgorithmInterface>
        implements AlgorithmService {
    /**
     * * Operation getAlgorithmsJSON
     * 
     * @param -
     * 
     * @return String
     */
    public String getAlgorithmsJSON() {
        return null;
    }

    /**
     * Operation deleteAlgorithms
     *
     */
    public void deleteAlgorithms() {
    }

    /**
     * Operation addAlgorithm
     *
     * @param algo
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     */
    public void addAlgorithm(InputStream algo, String name, String desc) {
    }

    /**
     * Operation getAlgorithms
     *
     * @return Set<Algorithm>
     */
    protected Set<Algorithm> getAlgorithms() {
        return new HashSet<Algorithm>();
    }

    @Override
    protected AlgorithmInterface intitializeMediation(String username,
            URI request) throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
