/**
 * Sign in command
 * <p>
 *     This class represents the command to sign in a user.
 * </p>
 * @param username the username of the user
 * @param password the password of the user
 *
 * @see com.acme.center.platform.iam.domain.model.aggregates.User
 */
package com.acme.center.platform.iam.domain.model.commands;

public record SignInCommand(String username, String password) {
}