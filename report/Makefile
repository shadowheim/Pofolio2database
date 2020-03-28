.PHONY: typeset

typeset:
	pandoc                            \
	  --from          markdown        \
	  --to            latex           \
	  --template      template.tex    \
	  --out           report.pdf      \
	 `cat index.txt`
