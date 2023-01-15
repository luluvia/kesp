package com.github.darkxanter.exposed.ksp.annotation

/**
 * Specifies that the column value is generated by a database.
 *
 * @see Id
 * @see ExposedTable
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
public annotation class GeneratedValue
