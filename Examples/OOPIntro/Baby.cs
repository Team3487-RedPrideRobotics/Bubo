public class Baby {
    public Baby(Human parentOne, Human parentTwo) {
        CombineGenomes(parentOne, parentTwo);
    }
    public Baby(Human geneticDonor) {
        Clone(geneticDonor);
    }
    public Baby(Human pactSigner, Demon pactMaster) {
        CommenceUnholySacrament(pactSigner, pactMaster);
    }

    #region hide complex biological implementations
    private void CombineGenomes(Human one, Human two) {}
    private void Clone (Human one) {}
    [Obsolete("This method will likely commence the end of days, please avoid usage.")]
    private void CommenceUnholySacrament(Human one, Demon two) {}
    #endregion
}

#region hide for example
public class Human {}
public class Demon {}
#endregion