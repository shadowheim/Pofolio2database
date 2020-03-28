.PHONY: report 

FILES= `cat index.txt`

notes:
	pandoc                                  \
	  --from          markdown              \
	  --to            latex                 \
	  --template      template.tex          \
	  --out           $(class).pdf          \
	  --pdf-engine    xelatex               \
	  --bibliography  biblio.bib            \
	  --csl           style.csl             \
	  --resource-path $(path)/images        \
	  $(FILES)
