// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection With References Page.
 */
public class TokenIssuancePolicyCollectionWithReferencesPage extends BaseCollectionPage<TokenIssuancePolicy> {

    /**
     * A collection page for TokenIssuancePolicy
     *
     * @param response the serialized TokenIssuancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenIssuancePolicyCollectionWithReferencesPage(final TokenIssuancePolicyCollectionResponse response, final TokenIssuancePolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
