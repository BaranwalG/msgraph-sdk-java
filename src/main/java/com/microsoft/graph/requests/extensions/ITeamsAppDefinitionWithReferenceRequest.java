// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Definition With Reference Request.
 */
public interface ITeamsAppDefinitionWithReferenceRequest extends IHttpRequest {

    void post(final TeamsAppDefinition newTeamsAppDefinition, final IJsonBackedObject payload, final ICallback<TeamsAppDefinition> callback);

    TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<TeamsAppDefinition> callback);

    TeamsAppDefinition get() throws ClientException;

	void delete(final ICallback<TeamsAppDefinition> callback);

	void delete() throws ClientException;

	void patch(final TeamsAppDefinition sourceTeamsAppDefinition, final ICallback<TeamsAppDefinition> callback);

	TeamsAppDefinition patch(final TeamsAppDefinition sourceTeamsAppDefinition) throws ClientException;

    ITeamsAppDefinitionWithReferenceRequest select(final String value);

    ITeamsAppDefinitionWithReferenceRequest expand(final String value);

}
