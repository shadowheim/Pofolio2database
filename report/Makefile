.PHONY: typeset

typeset:
	pandoc                            \
	  --from          markdown        \
	  --to            latex           \
	  --resource-path markdown/images \
	  --template      template.tex    \
	  --out           report.pdf      \
	  --pdf-engine    xelatex         \
	  `cat index.txt`
