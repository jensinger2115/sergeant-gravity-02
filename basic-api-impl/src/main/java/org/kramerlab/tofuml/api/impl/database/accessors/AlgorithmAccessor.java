package org.kramerlab.tofuml.api.impl.database.accessors;

import java.net.URI;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.ReviewableSEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;

public class AlgorithmAccessor extends ReviewableSEITANObjectAccessor {
    public AlgorithmAccessor(URI databaseId, Permission perm) {
        super(databaseId, perm);
    }

    /**
     * Operation concreteSave
     *
     * @param obj
     *            -
     * @return SEITANObject
     */
    public SEITANObject concreteSave(SEITANObject obj) {
        return null;
    }

    /**
     * Operation concreteUpdate
     *
     * @param obj
     *            -
     */
    public void concreteUpdate(SEITANObject obj) {
    }

    /**
     * Operation concreteDelete
     *
     * @param obj
     *            -
     */
    public void concreteDelete(SEITANObject obj) {
    }

    /**
     * Operation getJarPath
     *
     * @return String
     */
    public String getJarPath() {
        return null;
    }

    /**
     * Operation getClassifierClass
     *
     * @return String
     */
    public String getClassifierClass() {
        return null;
    }
}
