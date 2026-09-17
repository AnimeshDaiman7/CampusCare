# Project Statement and Scope Specification

## Project title

CampusCare - Lost-and-Found Item Manager

## Problem statement

Lost personal belongings are commonly reported in libraries, classrooms, laboratories, and common areas. When records are kept informally, it is difficult to search for items, know where a found item is stored, or confirm whether an item was returned. CampusCare provides a small command-line system that stores lost and found item records in a consistent format and produces an exportable report.

## Scope

### In scope

- Registering a lost item or found item.
- Capturing title, category, location, reporting date, and a type-specific detail.
- Viewing all records and searching by a keyword.
- Marking a returned item as resolved.
- Exporting the current records to a text report.

### Out of scope / future enhancements

- Login and authentication.
- A graphical or web interface.
- A database or long-term loading of records between program runs.
- Uploading images of items.
- Automatic notifications to students.

## Target users

- Students reporting a lost belonging.
- Campus security or a help-desk volunteer recording found items.
- Staff members who need a simple list of currently open records.

## High-level features

| ID | Feature | Description |
| --- | --- | --- |
| FEAT-01 | Item registration | Adds a lost or found item with common fields. |
| FEAT-02 | Type-specific details | Records an identifying detail or the person/location holding a found item. |
| FEAT-03 | Record listing | Shows all current records and their status. |
| FEAT-04 | Keyword search | Finds records from a title, category, or location keyword. |
| FEAT-05 | Resolution tracking | Marks an item as returned/resolved. |
| FEAT-06 | Report export | Writes an item report using Java file I/O. |
