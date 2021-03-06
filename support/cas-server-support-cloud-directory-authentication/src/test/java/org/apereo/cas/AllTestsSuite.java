
package org.apereo.cas;

import org.apereo.cas.authentication.AmazonCloudDirectoryAuthenticationHandlerTests;
import org.apereo.cas.clouddirectory.AmazonCloudDirectoryUtilsTests;
import org.apereo.cas.clouddirectory.DefaultAmazonCloudDirectoryRepositoryTests;
import org.apereo.cas.config.CloudDirectoryAuthenticationConfigurationTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    DefaultAmazonCloudDirectoryRepositoryTests.class,
    AmazonCloudDirectoryUtilsTests.class,
    CloudDirectoryAuthenticationConfigurationTests.class,
    AmazonCloudDirectoryAuthenticationHandlerTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
