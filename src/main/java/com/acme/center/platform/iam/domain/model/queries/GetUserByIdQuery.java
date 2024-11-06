/**
 * Get user by id query
 * <p>
 *     This class represents the query to get a user by its id.
 * </p>
 * @param userId the id of the user
 */
package com.acme.center.platform.iam.domain.model.queries;

public record GetUserByIdQuery(Long userId) {
}
