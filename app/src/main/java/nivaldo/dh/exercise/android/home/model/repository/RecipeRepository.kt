@file:Suppress("SpellCheckingInspection")

package nivaldo.dh.exercise.android.home.model.repository

import nivaldo.dh.exercise.android.home.model.Recipe
import nivaldo.dh.exercise.android.home.model.Restaurant

class RecipeRepository {

    private val recipesList = listOf(
        Recipe(
            id = 1,
            restaurantId = 1,
            name = "Salada de Gengibre Agridoce",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sollicitudin urna quis velit faucibus feugiat. Vivamus sit amet nibh leo. Donec faucibus velit sed quam maximus, sed vestibulum velit malesuada. Nulla ut elit magna. Aliquam lobortis felis diam, vitae gravida nisl varius id. Maecenas et semper ex. Nulla lobortis diam eu elit porta, eget pulvinar lorem pellentesque. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed volutpat erat dictum, lacinia mauris non, malesuada turpis. Donec placerat erat nisl, ut sodales eros euismod quis. Maecenas tincidunt, sem iaculis convallis sodales, diam sem vulputate nisl, eget dictum erat tellus eu eros. Praesent a iaculis leo, et accumsan arcu. Maecenas ut commodo mi. Pellentesque nec accumsan libero. Nulla ullamcorper varius nulla sit amet laoreet. Donec consectetur at odio nec venenatis.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/01.jpg",
        ),
        Recipe(
            id = 2,
            restaurantId = 1,
            name = "Salada Asiática",
            description = "Proin vitae eleifend nibh. Maecenas lobortis volutpat arcu, vitae posuere dolor laoreet ac. Aliquam elementum, neque at mattis viverra, quam dui facilisis tellus, eget sodales diam nulla non nibh. Vivamus convallis, quam vel interdum posuere, orci risus scelerisque risus, a suscipit est augue vel urna. Donec ornare nisi non diam faucibus vehicula. Phasellus quis lectus sagittis, volutpat augue vitae, malesuada purus. Quisque quam odio, tincidunt quis neque ac, sagittis dignissim tortor. Cras non congue ligula. Maecenas sodales volutpat risus, at posuere eros efficitur ac.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/02.jpg",
        ),
        Recipe(
            id = 3,
            restaurantId = 1,
            name = "Salada Tailandesa",
            description = "Sed viverra diam quis tortor varius egestas. Morbi ut posuere risus. Maecenas at volutpat magna. Duis a justo a elit convallis facilisis vel sit amet ante. Etiam blandit in magna sit amet egestas. Fusce at eros sit amet dui euismod auctor. Praesent a lectus accumsan, fringilla magna sed, ultrices libero. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc vel libero cursus, fermentum nisl sed, vehicula ex. Pellentesque commodo justo nec maximus varius. Nulla elit sem, dictum in nunc ac, pharetra laoreet felis. Donec aliquam rutrum ante at condimentum. Cras a sem eget massa hendrerit ornare.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/03.jpg",
        ),
        Recipe(
            id = 4,
            restaurantId = 1,
            name = "Salada Verde com Abacaxi",
            description = "Praesent maximus quam ac pharetra finibus. Cras consequat turpis turpis, a posuere magna semper eu. Nulla consectetur, magna at consectetur egestas, erat ligula varius lectus, ac rhoncus arcu libero id odio. Duis posuere, est et vestibulum egestas, tellus diam lobortis ipsum, id tincidunt dui ipsum consectetur ligula. Nunc tempor viverra leo id pulvinar. Nulla vel luctus lectus, ac tempor mauris. Sed ipsum nisl, auctor eu nunc et, dapibus vulputate quam. Sed condimentum velit orci, vitae tincidunt arcu vestibulum eget. Maecenas viverra mollis pharetra.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/04.jpg",
        ),

        Recipe(
            id = 5,
            restaurantId = 2,
            name = "Steak de Chicago",
            description = "Praesent fermentum ornare malesuada. Suspendisse vehicula fermentum interdum. Suspendisse gravida eros magna. Donec semper, risus sit amet blandit porta, leo dolor pulvinar turpis, non imperdiet lacus eros eu orci. In sed tincidunt quam, nec tempus turpis. In et nisi rutrum, interdum tortor dictum, mattis neque. Nulla vitae tincidunt leo. Duis pharetra purus eu consequat tincidunt. Fusce ut tincidunt est. Fusce nibh est, feugiat sit amet commodo sit amet, egestas et nulla. Vivamus mollis congue egestas. Suspendisse vehicula nulla tempor, suscipit orci eu, tempus dui. Nulla facilisi. Aliquam id libero turpis. Sed hendrerit lorem vel efficitur scelerisque. Mauris leo odio, cursus vel ipsum in, faucibus ornare nisi.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/05.jpg",
        ),
        Recipe(
            id = 6,
            restaurantId = 2,
            name = "Steak de Frango",
            description = "Donec id egestas ipsum, at blandit velit. Mauris ultricies scelerisque cursus. Donec faucibus scelerisque mauris, sed egestas risus. Ut sagittis turpis sit amet maximus sodales. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce auctor ligula et tincidunt malesuada. Proin maximus placerat lorem. Sed non enim vel enim egestas imperdiet.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/06.jpg",
        ),
        Recipe(
            id = 7,
            restaurantId = 2,
            name = "Steak Tartar",
            description = "Proin maximus odio a aliquam tempus. Suspendisse potenti. Pellentesque tincidunt nisl vitae augue convallis, ut malesuada ligula congue. Proin a mattis nibh. Aenean ac nisl id erat tempus dapibus. Curabitur scelerisque, nisl eget pretium iaculis, sem nunc rhoncus est, ac consectetur nunc dolor quis augue. Fusce egestas fermentum elit. Sed luctus eleifend urna. Vestibulum in leo placerat, pharetra sem lobortis, luctus elit. Ut tincidunt velit sit amet vehicula maximus. Aenean erat ipsum, mollis in porttitor dictum, maximus nec nulla. Fusce finibus porta elementum.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/07.jpg",
        ),
        Recipe(
            id = 8,
            restaurantId = 2,
            name = "Bife Ancho com Manteiga de Ervas",
            description = "Vestibulum nec lacus id ligula aliquet condimentum. Sed eu nibh sit amet massa gravida rutrum congue vitae nisl. Curabitur auctor hendrerit aliquet. Curabitur lobortis facilisis nulla at cursus. Nunc quis massa pretium ex tincidunt facilisis eget nec turpis. Phasellus porta mauris ac enim hendrerit, id blandit ipsum sagittis. Vivamus mollis nulla id consequat condimentum. Duis egestas turpis nec ipsum vestibulum, sed facilisis risus gravida. In hac habitasse platea dictumst. Donec porta nibh risus, vel ullamcorper dolor egestas sed. Aenean interdum leo ut nulla viverra, eu bibendum odio dictum. Duis pellentesque imperdiet nulla, eu gravida felis maximus in.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/08.jpg",
        ),

        Recipe(
            id = 9,
            restaurantId = 3,
            name = "Pizza Brasileira",
            description = "Phasellus tristique metus et gravida dignissim. Maecenas finibus, justo et finibus euismod, magna eros volutpat diam, nec porttitor risus diam in odio. Duis dapibus enim sit amet lacus laoreet tempus. Phasellus dignissim risus quis ultrices laoreet. Phasellus leo mi, iaculis id leo ac, egestas hendrerit tellus. Pellentesque ac tempor nunc. Nulla tincidunt eu nulla sit amet finibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec blandit nisl a neque rhoncus, sit amet volutpat est accumsan. Nam aliquam nulla massa.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/09.jpg",
        ),
        Recipe(
            id = 10,
            restaurantId = 3,
            name = "Pizza de Calabresa",
            description = "In in magna tristique, maximus leo sed, vestibulum dui. Quisque euismod venenatis pharetra. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed eu mauris vel nunc pellentesque consectetur sit amet a arcu. Praesent id luctus massa. Fusce vulputate felis erat, at viverra neque placerat eget. Proin quis placerat purus. Donec quis quam ullamcorper, dignissim nisi ut, rutrum odio.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/10.jpg",
        ),
        Recipe(
            id = 11,
            restaurantId = 3,
            name = "Pizza de Quatro Queijos",
            description = "Duis vel arcu turpis. Vestibulum imperdiet ultricies faucibus. Nunc laoreet quam vel semper tincidunt. Mauris hendrerit vestibulum ante, ac egestas mi laoreet sed. Praesent at sagittis lorem. Nulla feugiat urna vitae est auctor congue. Ut at diam hendrerit, scelerisque nulla sit amet, auctor nisi. Fusce ut tincidunt augue. Etiam eu varius diam. Sed malesuada, augue non tincidunt sodales, ante dolor condimentum libero, ac interdum orci augue et nunc. Curabitur semper eros elit. Donec libero augue, scelerisque sit amet est sed, gravida consectetur arcu.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/11.jpg",
        ),
        Recipe(
            id = 12,
            restaurantId = 3,
            name = "Pizza Portuguesa",
            description = "Integer placerat venenatis nulla in volutpat. Fusce maximus libero vel nisi vulputate fringilla. Suspendisse ac tempus urna. Interdum et malesuada fames ac ante ipsum primis in faucibus. Suspendisse quis dui a nisl feugiat imperdiet dignissim vitae ante. Nam efficitur urna convallis elit pellentesque, at aliquam nisl hendrerit. Morbi mollis justo arcu. Maecenas nec eleifend urna. Vivamus condimentum nunc tortor, vitae sollicitudin urna faucibus vel. Vestibulum lacinia hendrerit odio ac condimentum. Proin tempus semper dui, in laoreet sapien eleifend in.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/12.jpg",
        ),

        Recipe(
            id = 13,
            restaurantId = 4,
            name = "Carne Cozida com Legumes",
            description = "Integer blandit nunc vel massa lobortis maximus. Phasellus dapibus pulvinar libero et tempor. Aenean egestas a libero quis porta. Suspendisse tincidunt libero elit, quis fringilla nisl bibendum ut. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum a consectetur eros. Phasellus pellentesque efficitur porttitor. Vivamus ac nisi et felis pellentesque auctor. Pellentesque id ante porta, faucibus nisl sed, interdum diam. Fusce tempus magna in est sodales malesuada. Pellentesque et nulla placerat, elementum elit a, sagittis enim. Morbi vestibulum quis leo non mollis.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/13.jpg",
        ),
        Recipe(
            id = 14,
            restaurantId = 4,
            name = "Carne à Moda Chinesa",
            description = "Sed sollicitudin ante a ipsum interdum, vel iaculis ex tristique. Pellentesque tincidunt dui in metus fringilla laoreet. Pellentesque vestibulum ex sit amet libero porta, a luctus augue varius. Praesent finibus fringilla velit sit amet ullamcorper. Nunc nec congue nibh, vitae aliquet felis. Aliquam convallis ac nunc in ullamcorper. Aenean vitae nisi ac sapien convallis vestibulum nec eu elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In hac habitasse platea dictumst. Maecenas quis leo massa. Proin mattis libero vel turpis ultrices, eu facilisis libero fringilla. Nunc vehicula bibendum volutpat.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/14.jpg",
        ),
        Recipe(
            id = 15,
            restaurantId = 4,
            name = "Carne de Sol na Chapa",
            description = "Nullam eget fringilla turpis. Vivamus non sapien et nunc fermentum laoreet sed quis nunc. Aliquam placerat mauris in quam ullamcorper, quis convallis leo congue. Phasellus et tellus at mi dictum tincidunt. Aliquam consectetur consectetur augue, ac mollis est suscipit ut. Duis nec tortor ut purus tempus sollicitudin. Integer ac lacus in dui pretium dapibus. Donec gravida pellentesque felis, ut ultrices lectus tincidunt sit amet. Ut vel eros pretium, lobortis diam et, feugiat diam. Nunc sed maximus ligula. Duis vitae diam at magna finibus pharetra et vitae eros. Curabitur non accumsan lorem. Suspendisse dictum lorem dictum ultricies blandit. Nam posuere vel arcu ut malesuada. Morbi lobortis fringilla mauris, eget tempus mauris gravida eu. Sed commodo sagittis lectus, sollicitudin egestas lacus porttitor et.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/15.jpg",
        ),
        Recipe(
            id = 16,
            restaurantId = 4,
            name = "Picadinho de Carne",
            description = "Praesent pharetra gravida nisl id pretium. Nulla elementum maximus nisl vulputate congue. Nunc eu lacus malesuada turpis placerat mollis id lobortis urna. Fusce varius ut velit bibendum dictum. Proin mauris augue, dapibus at mattis in, efficitur id nulla. Donec tincidunt felis lobortis ex efficitur, at faucibus orci bibendum. Nullam est tortor, consequat nec imperdiet sit amet, venenatis ut est.",
            imageUrl = "https://github.com/nivaldomcj/dh-android-desafio2/raw/main/img/recipes/16.jpg",
        ),
    )

    fun getRestaurantRecipes(restaurant: Restaurant): List<Recipe> {
        return recipesList.filter { it.restaurantId == restaurant.id }
    }

}