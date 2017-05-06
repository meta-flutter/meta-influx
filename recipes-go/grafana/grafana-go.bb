require grafana.inc
inherit go npm-base

DESCRIPTION = "Grafana Go Backend"
GO_IMPORT = "${REPO}"
SRC_URI = "git://${REPO};protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=${LIC_CHKSUM}"

FILES_${PN} += "${GOBIN_FINAL}/*"


DEPENDS+= "\
    github.com-couchbase-go-couchbase \
    github.com-kr-pty \
    github.com-lunny-nodb \
    github.com-siddontang-ledisdb \
    github.com-edsrzf-mmap-go \
    grpc-go \
    nodejs \
"

GO_INSTALL = "\
      ${GO_IMPORT}/pkg/...  \
"
RDEPENDS_${PN}-staticdev += "\
                             bash \
                             expect \
                            "
                           
RDEPENDS_${PN} += " nodejs"     

do_install_append() {
    oe_runnpm install     # Installs dependencies defined in package.json
}            