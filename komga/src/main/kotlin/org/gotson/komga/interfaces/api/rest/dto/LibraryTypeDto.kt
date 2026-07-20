package org.gotson.komga.interfaces.api.rest.dto

import org.gotson.komga.domain.model.Library

enum class LibraryTypeDto {
  COMICS,
  BOOKS,
}

fun Library.Type.toDto() =
  when (this) {
    Library.Type.COMICS -> LibraryTypeDto.COMICS
    Library.Type.BOOKS -> LibraryTypeDto.BOOKS
  }

fun LibraryTypeDto.toDomain() =
  when (this) {
    LibraryTypeDto.COMICS -> Library.Type.COMICS
    LibraryTypeDto.BOOKS -> Library.Type.BOOKS
  }
