# meta-rubygems

A layer providing gems for Ruby.

## Tested variants

The following variants are tested regularly:

| variant   | glibc                                                                                                                                         |
| --------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| qemuarm64 | ![[master]-[glibc]-[qemuarm64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemuarm64%5D/badge.svg) |

Other variants most likely will work.
Feel free to contribute any needed patches.

### Tested revisions

Up to the following revisions automated checks being performed

* poky: 873fd0ce55d29ac6958b8fdbf81cca57555f13f0
* meta-openembedded: d4e70a19600bee178d81b467dd9e118cbf057f65

## Support

This layer is a rolling release.
Integration is continuously checked against the respective [revisions](#tested-revisions) of the corresponding layers.
Don't expect tags or any kind of versioning.

### poky release mapping

please check the following table to pick the correct branch matching your poky version

| poky release | suggested meta-rubygems branch | ruby version | maintainer     |
| ------------ | ------------------------------ | ------------ | -------------- |
| master       | master                         | 3.1.x        | priv-kweihmann |
| honister     | hardknott                      | 3.0.x        | n.a.           |
| hardknott    | hardknott                      | 3.0.x        | n.a.           |
| gatesgarth   | dunfell                        | 2.7.x        | n.a.           |
| dunfell      | dunfell                        | 2.7.x        | n.a.           |
| zeus         | zeus                           | 2.5.x        | n.a.           |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
