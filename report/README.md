# Markdown template for reports (with bibliography)
A simple template for writing reports in [Markdown](http://commonmark.org/) using
[Pandoc](http://pandoc.org/) for school/college/university/whatever with bibliography support.

## Typeset
Call `make class=<class>` so you can make pdf files from a given class. The current structure is such that a class has to be in `Noter/` and the class name (case sensitive) has to be the same as what you call the folder.

## Replacing sample data
Edit the `cover.tex` file with the name of students and supervisor(s). In the future, each class will get their own `cover.tex` file, so the the proper students and title will be made when calling `make class=<class>`.

The `template.tex` file work as a template for LaTeX and preamble for LaTeX.  Edit this file for
using other packages, settings etc.

Lastly you want to remove the directories filled with Markdown files and write your own. Add the new
files to the `index.txt` file.

## Bibliography

There's a central `biblio.bib` file. You can add your own in your class' notes directory if you prefer, though the central is preffered, as it can then be used for projects as well. Please consider naming, and run through it, to see if your name has already been used.