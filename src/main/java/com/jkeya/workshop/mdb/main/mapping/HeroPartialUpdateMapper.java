package com.jkeya.workshop.mdb.main.mapping;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.jkeya.workshop.mdb.main.Hero;

/**
 * Mapper to map <code><strong>non-null</strong></code> fields on an input {@link Hero} onto a target {@link Hero}.
 */
@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = IGNORE)
public interface HeroPartialUpdateMapper {
	/**
	 * Maps all <code><strong>non-null</strong></code> fields from {@code input} onto {@code target}.
	 * @param input The input {@link Hero}
	 * @param target The target {@link Hero}
	 */
	void mapPartialUpdate(Hero input, @MappingTarget Hero target);
}
