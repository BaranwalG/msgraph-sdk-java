// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition Reference Request.
 */
public class RoleDefinitionReferenceRequest extends BaseRequest implements IRoleDefinitionReferenceRequest {

    /**
     * The request for the RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleDefinitionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleDefinition.class);
    }

    public void delete(final ICallback<RoleDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public RoleDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleDefinitionReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (RoleDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleDefinitionReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (RoleDefinitionReferenceRequest)this;
    }
    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(RoleDefinition srcRoleDefinition, final ICallback<RoleDefinition> callback) {
        send(HttpMethod.PUT, callback, srcRoleDefinition);
    }

    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition reference to PUT
     * @return the RoleDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public RoleDefinition put(RoleDefinition srcRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcRoleDefinition);
    }
}
