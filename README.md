# meta-rubygems

A layer providing gems for Ruby.

## Tested variants

The following variants are tested regularly:

| variant    | glibc                                                                                                                                           |
| ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| qemuarm64 | ![[master]-[glibc]-[qemuarm64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemuarm64%5D/badge.svg) |

Other variants most likely will work.
Feel free to contribute any needed patches.

### Tested revisions

Up to the following revisions automated checks being performed

* poky: 2c8f3be3a559158b1d475da1931a659dad5b9414
* meta-openembedded: 268e844999c417010baecdf5b42c7b32e2f4b658

## Support

This layer is a rolling release.
Integration is continuously checked against the respective [revisions](#tested-revisions) of the corresponding layers.
Don't expect tags or any kind of versioning.

### poky release mapping

please check the following table to pick the correct branch matching your poky version

| poky release | suggested meta-rubygems branch | ruby version |
| ------------ | ------------------------------ | ------------ |
| master       | master                         | 3.1.x        |
| honister     | hardknott                      | 3.0.x        |
| hardknott    | hardknott                      | 3.0.x        |
| gatesgarth   | dunfell                        | 2.7.x        |
| dunfell      | dunfell                        | 2.7.x        |
| zeus         | zeus                           | 2.5.x        |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
