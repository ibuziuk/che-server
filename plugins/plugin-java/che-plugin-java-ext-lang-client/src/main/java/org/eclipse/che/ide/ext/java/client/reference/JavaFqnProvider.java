/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.ext.java.client.reference;

import com.google.inject.Singleton;

import org.eclipse.che.ide.api.reference.FqnProvider;
import org.eclipse.che.ide.ext.java.client.project.node.JavaFileNode;
import org.eclipse.che.ide.ext.java.client.project.node.PackageNode;

/**
 * The class contains business logic which allows extract fqn for {@link PackageNode} and {@link JavaFileNode}.
 *
 * @author Dmitry Shnurenko
 */
@Singleton
public class JavaFqnProvider implements FqnProvider {

    @Override
    public String getFqn(Object object) {
        if (object instanceof PackageNode) {
            return ((PackageNode)object).getPackage();
        }

        if (object instanceof JavaFileNode) {
            return ((JavaFileNode)object).getFqn();
        }

        return "";
    }
}
